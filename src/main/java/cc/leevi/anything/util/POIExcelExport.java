package cc.leevi.anything.util;

import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 2017-06-13.
 */
public class POIExcelExport {
    // 文件名
    private String fileName ;
    //文件保存路径
    private String fileDir;
    //sheet名
    private String sheetName = "sheet1";
    //表头字体
    private String titleFontType = "Arial Unicode MS";
    //表头背景色
    private String titleBackColor = "C1FBEE";
    //表头字号
    private short titleFontSize = 12;
    //添加自动筛选的列 如 A:M
    private String address = "";
    //正文字体
    private String contentFontType = "Arial Unicode MS";
    //正文字号
    private short contentFontSize = 12;
    //Float类型数据小数位
    private String floatDecimal = ".00";
    //Double类型数据小数位
    private String doubleDecimal = ".00";
    //设置列的公式
    private String colFormula[] = null;

    DecimalFormat floatDecimalFormat=new DecimalFormat(floatDecimal);
    DecimalFormat doubleDecimalFormat=new DecimalFormat(doubleDecimal);

    private HSSFWorkbook workbook = null;

    public POIExcelExport() {
        workbook = new HSSFWorkbook();
    }

    /**
     * 设置表头字体.
     * @param titleFontType
     */
    public void setTitleFontType(String titleFontType) {
        this.titleFontType = titleFontType;
    }
    /**
     * 设置表头背景色.
     * @param titleBackColor 十六进制
     */
    public void setTitleBackColor(String titleBackColor) {
        this.titleBackColor = titleBackColor;
    }
    /**
     * 设置表头字体大小.
     * @param titleFontSize
     */
    public void setTitleFontSize(short titleFontSize) {
        this.titleFontSize = titleFontSize;
    }
    /**
     * 设置表头自动筛选栏位,如A:AC.
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 设置正文字体.
     * @param contentFontType
     */
    public void setContentFontType(String contentFontType) {
        this.contentFontType = contentFontType;
    }
    /**
     * 设置正文字号.
     * @param contentFontSize
     */
    public void setContentFontSize(short contentFontSize) {
        this.contentFontSize = contentFontSize;
    }
    /**
     * 设置float类型数据小数位 默认.00
     * @param doubleDecimal 如 ".00"
     */
    public void setDoubleDecimal(String doubleDecimal) {
        this.doubleDecimal = doubleDecimal;
    }
    /**
     * 设置doubel类型数据小数位 默认.00
     * @param floatDecimalFormat 如 ".00
     */
    public void setFloatDecimalFormat(DecimalFormat floatDecimalFormat) {
        this.floatDecimalFormat = floatDecimalFormat;
    }
    /**
     * 设置列的公式
     * @param colFormula  存储i-1列的公式 涉及到的行号使用@替换 如A@+B@
     */
    public void setColFormula(String[] colFormula) {
        this.colFormula = colFormula;
    }
    /**
     * 写excel.
     * @param titleColumn  对应bean的属性名
     * @param titleName   excel要导出的表名
     * @param dataList  数据
     */
    public void wirteExcel(String titleColumn[],String titleName[],List<?> dataList,OutputStream ops){
        //添加Worksheet（不添加sheet时生成的xls文件打开时会报错)
        Sheet sheet = workbook.createSheet(this.sheetName);
        Drawing<?> patriarch = sheet.createDrawingPatriarch();
        //新建文件
        try {
            //写入excel的表头
            Row titleNameRow = workbook.getSheet(sheetName).createRow(0);
            //设置样式
            HSSFCellStyle titleStyle = workbook.createCellStyle();
            titleStyle = (HSSFCellStyle) setFontAndBorder(titleStyle, titleFontType, (short) titleFontSize);
            titleStyle = (HSSFCellStyle) setColor(titleStyle, titleBackColor, (short)10);

            for(int i = 0;i < titleName.length;i++){
                if("图片".equals(titleName[i])){
                    sheet.setColumnWidth(i, 80*256);    //设置宽度
                    Cell cell = titleNameRow.createCell(i);
                    cell.setCellStyle(titleStyle);
                    cell.setCellValue(titleName[i].toString());
                }else{
                    sheet.setColumnWidth(i, 12*256);    //设置宽度
                    Cell cell = titleNameRow.createCell(i);
                    cell.setCellStyle(titleStyle);
                    cell.setCellValue(titleName[i].toString());
                }
            }

            //为表头添加自动筛选
            if(!"".equals(address)){
                CellRangeAddress c = (CellRangeAddress) CellRangeAddress.valueOf(address);
                sheet.setAutoFilter(c);
            }

            //通过反射获取数据并写入到excel中
            if(dataList!=null&&dataList.size()>0){
                //设置样式
                HSSFCellStyle dataStyle = workbook.createCellStyle();
                titleStyle = (HSSFCellStyle) setFontAndBorder(titleStyle, contentFontType, (short) contentFontSize);
                if(titleColumn.length>0){
                    for(int rowIndex = 1;rowIndex<=dataList.size();rowIndex++){
                        Object obj = dataList.get(rowIndex-1);     //获得该对象
                        Class clsss = obj.getClass();     //获得该对对象的class实例
                        Row dataRow = workbook.getSheet(sheetName).createRow(rowIndex);
                        //px = height / 20
                        dataRow.setHeight((short) 2400);
                        for(int columnIndex = 0;columnIndex<titleColumn.length;columnIndex++){
                            String title = titleColumn[columnIndex].toString().trim();
                            if(!"".equals(title)){  //字段不为空
                                //使首字母大写
                                String UTitle = Character.toUpperCase(title.charAt(0))+ title.substring(1, title.length()); // 使其首字母大写;
                                String methodName  = "get"+UTitle;

                                // 设置要执行的方法
                                Method method = clsss.getDeclaredMethod(methodName);

                                //获取返回类型
                                String returnType = method.getReturnType().getName();



                                if(title.equals("images")){
                                    Cell cell = dataRow.createCell(columnIndex);
                                    List<String> images = (List<String>) method.invoke(obj);
                                    BufferedImage wrap = imageJoin(images);
                                    if(wrap!=null){
                                        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) columnIndex, rowIndex, (short) (columnIndex+1),rowIndex+1);
                                        anchor.setAnchorType(ClientAnchor.AnchorType.DONT_MOVE_AND_RESIZE);
                                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                                        try{
                                            ImageIO.write(wrap,"JPG",baos);
                                            patriarch.createPicture(anchor, workbook.addPicture(baos.toByteArray(),HSSFWorkbook.PICTURE_TYPE_JPEG));
                                        }catch (Exception e){
                                            e.printStackTrace();
                                        }finally {
                                            baos.close();
                                        }

                                    }
                                }else{
                                    String data = method.invoke(obj)==null?"":method.invoke(obj).toString();
                                    Cell cell = dataRow.createCell(columnIndex);
                                    if(data!=null&&!"".equals(data)){
                                        if("int".equals(returnType)){
                                            cell.setCellValue(Integer.parseInt(data));
                                        }else if("long".equals(returnType)){
                                            cell.setCellValue(Long.parseLong(data));
                                        }else if("float".equals(returnType)){
                                            cell.setCellValue(floatDecimalFormat.format(Float.parseFloat(data)));
                                        }else if("double".equals(returnType)){
                                            cell.setCellValue(doubleDecimalFormat.format(Double.parseDouble(data)));
                                        }else{
                                            cell.setCellValue(data);
                                        }
                                    }
                                }

                            }else{   //字段为空 检查该列是否是公式
                                if(colFormula!=null){
                                    String sixBuf = colFormula[columnIndex].replace("@", (rowIndex+1)+"");
                                    Cell cell = dataRow.createCell(columnIndex);
                                    cell.setCellFormula(sixBuf.toString());
                                }
                            }
                        }
                    }

                }
            }
            workbook.write(ops);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 将16进制的颜色代码写入样式中来设置颜色
     * @param style  保证style统一
     * @param color 颜色：66FFDD
     * @param index 索引 8-64 使用时不可重复
     * @return
     */
    public CellStyle setColor(CellStyle style,String color,short index){
        if(color!=""&&color!=null){
            //转为RGB码
            int r = Integer.parseInt((color.substring(0,2)),16);   //转为16进制
            int g = Integer.parseInt((color.substring(2,4)),16);
            int b = Integer.parseInt((color.substring(4,6)),16);
            //自定义cell颜色
            HSSFPalette palette = workbook.getCustomPalette();
            palette.setColorAtIndex((short)index, (byte) r, (byte) g, (byte) b);

            style.setFillPattern(CellStyle.SOLID_FOREGROUND);
            style.setFillForegroundColor(index);
        }
        return style;
    }

    /**
     * 设置字体并加外边框
     * @param style  样式rcmd
     * @param style  字体名
     * @param style  大小
     * @return
     */
    public CellStyle setFontAndBorder(CellStyle style,String fontName,short size){
        HSSFFont font = workbook.createFont();
        font.setFontHeightInPoints(size);
        font.setFontName(fontName);
        font.setBold(true);
        style.setFont(font);
        style.setBorderBottom(CellStyle.BORDER_THIN); //下边框
        style.setBorderLeft(CellStyle.BORDER_THIN);//左边框
        style.setBorderTop(CellStyle.BORDER_THIN);//上边框
        style.setBorderRight(CellStyle.BORDER_THIN);//右边框
        return style;
    }

    public BufferedImage imageJoin(List<String> images){
        int width = 0;
        int defaultWidth = 450;
        int defaultHeight = 104;
        List<BufferedImage> cacheImages = new ArrayList<>();
        try{
            for(String image : images){
                BufferedImage bufferedImage = ImageIO.read(new URL(image));
                cacheImages.add(bufferedImage);
                width += bufferedImage.getWidth();
            }
            if(width!=0){
                BufferedImage wrap = new BufferedImage(width,
                        defaultHeight, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = wrap.createGraphics();
                int offsetX = 0;
                for(BufferedImage original : cacheImages){
                    g.drawImage(original,offsetX,0,original.getWidth(),defaultHeight,null);
                    offsetX += original.getWidth();
                }
                g.dispose();
                return wrap;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}