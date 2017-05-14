package cc.leevi.anything.util;

import com.github.kevinsawicki.http.HttpRequest;
import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by jiang on 2017-05-03.
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    private static String[] citys = new String[]{"北京","上海","天津","重庆","香港","澳门","石家庄","沧州","承德","秦皇岛","唐山","保定","廊坊","邢台","衡水","张家口","邯郸","任丘","河间","泊头","武安","沙河","南宫","深州","冀州","黄骅","高碑店","安国","涿州","定州","三河","霸州","迁安","遵化","鹿泉","新乐","晋州","藁城","辛集","太原","长治","大同","阳泉","朔州","临汾","晋城","忻州","运城","晋中","吕梁","古交","潞城","高平","原平","孝义","汾阳","介休","侯马","霍州","永济","河津","沈阳","大连","本溪","阜新","葫芦岛","盘锦","铁岭","丹东","锦州","营口","鞍山","辽阳","抚顺","朝阳","瓦房店","兴城","新民","普兰店","庄河","北票","凌源","调兵山","开原","灯塔","海城","凤城","东港","大石桥","盖州","凌海","北镇","长春","白城","白山","吉林","辽源","四平","通化","松原","珲春","龙井","舒兰","临江","公主岭","梅河口","德惠","九台","榆树","磐石","蛟河","桦甸","洮南","大安","双辽","集安","图们","敦化","和龙","哈尔滨","大庆","大兴安岭","鹤岗","黑河","鸡西","佳木斯","牡丹江","七台河","双鸭山","齐齐哈尔","伊春","绥化","虎林","五常","密山","宁安","漠河","海伦","肇东","安达","海林","绥芬河","富锦","同江","铁力","五大连池","北安","讷河","阿城","尚志","双城","南京","苏州","扬州","无锡","南通","常州","连云港","徐州","镇江","淮安","宿迁","泰州","太仓","盐城","高邮","新沂","金坛","溧阳","淮阴","江宁","睢宁","清江","昆山","常熟","江阴","宜兴","邳州","张家港","吴江","如皋","海门","启东","大丰","东台","仪征","扬中","句容","丹阳","兴化","姜堰","泰兴","靖江","杭州","宁波","温州","丽水","奉化","宁海","临海","三门","绍兴","舟山","义乌","北仑","慈溪","象山","余姚","天台","温岭","仙居","台州","嘉兴","湖州","衢州","金华","余杭","德清","海宁","临安","富阳","建德","平湖","桐乡","诸暨","上虞","嵊州","江山","兰溪","永康","东阳","瑞安","乐清","龙泉","合肥","黄山","芜湖","铜陵","安庆","滁州","宣城","阜阳","淮北","蚌埠","池州","青阳","九华山景区","黄山景区","巢湖","亳州","马鞍山","宿州","六安","淮南","绩溪","界首","明光","天长","桐城","宁国","福州","厦门","泉州","漳州","龙岩","三明","南平","永安","宁德","莆田","闽侯","福鼎","罗源","仙游","福清","长乐","云霄","长泰","东山岛","邵武","石狮","晋江","建阳","福安","漳平","龙海","南安","建瓯","武夷山","南昌","九江","赣州","景德镇","萍乡","新余","吉安","宜春","抚州","上饶","鹰潭","陵川","瑞金","井冈山","瑞昌","乐平","南康","德兴","丰城","樟树","高安","贵溪","济南","青岛","烟台","威海","潍坊","德州","滨州","东营","聊城","菏泽","济宁","临沂","淄博","泰安","枣庄","日照","莱芜","海阳","平度","莱阳","青州","肥城","章丘","即墨","利津","武城","桓台","沂源","曲阜","龙口","胶州","胶南","莱西","临清","乐陵","禹城","安丘","昌邑","高密","诸城","寿光","栖霞","莱州","蓬莱","招远","文登","荣成","乳山","滕州","兖州","邹城","新泰","郑州","安阳","济源","鹤壁","焦作","开封","濮阳","三门峡","驻马店","商丘","新乡","信阳","许昌","周口","南阳","洛阳","平顶山","漯河","中牟","洛宁","荥阳","登封","项城","灵宝","义马","舞钢","长葛","禹州","林州","辉县","卫辉","沁阳","孟州","偃师","新密","登封","新郑","汝州","永城","邓州","巩义","武汉","十堰","宜昌","鄂州","黄石","襄樊","荆州","荆门","孝感","黄冈","咸宁","随州","恩施","仙桃","天门","潜江","神农架","沙市","老河口","利川","当阳","枝江","宜都","松滋","洪湖","石首","赤壁","大冶","麻城","武穴","广水","安陆","应城","汉川","钟祥","宜城","枣阳","丹江口","长沙","张家界","株洲","韶山","衡阳","郴州","冷水江","娄底","耒阳","永州","湘乡","湘潭","常德","益阳","怀化","邵阳","岳阳","吉首","大庸","韶山","常宁","浏阳","津市","沅江","汨罗","临湘","醴陵","资兴","武冈","洪江","广州","深圳","珠海","东莞","佛山","潮州","汕头","湛江","中山","惠州","河源","揭阳","梅州","肇庆","茂名","云浮","阳江","江门","韶关","乐昌","化州","从化","鹤山","汕尾","清远","顺德","雷州","廉江","吴川","高州","信宜","阳春","罗定","四会","高要","开平","台山","恩平","陆丰","普宁","兴宁","南雄","连州","英德","增城","海口","三亚","琼海","儋州","文昌","万宁","东方","五指山","成都","内江","峨眉山","绵阳","宜宾","泸州","攀枝花","自贡","资阳","崇州","西昌","都江堰","遂宁","乐山","达州","江油","大邑","金堂","德阳","南充","广安","广元","巴中","雅安","眉山","三台","丹棱","梁平","万县","广汉","汶川县","什邡","彭州","绵竹","邛崃","阆中","华蓥","万源","简阳","昆明","西双版纳","大理","思茅","玉溪","曲靖","保山","昭通","临沧","丽江","文山","个旧","楚雄","宜良","沅江","安宁","宣威","瑞丽","开远","景洪","西安","宝鸡","延安","兴平","咸阳","铜川","渭南","汉中","榆林","安康","商洛","周至","韩城","华阴"};

    public static String buildUrl(String url, Map<String,Object> params,boolean encode){
        url = append(url, params);
        return encode ? encode(url) : url;
    }

    public static Double randomLon(){
        return randomLonLat(97.574061,117.222374,23.53827,41.596479,"Lon");
    }

    public static Double randomLat(){
        return randomLonLat(97.574061,117.222374,23.53827,41.596479,"Lat");
    }

    /**
     * 随机城市
     * @return
     */
    public static String randomCity(){
        int idx = RandomUtils.nextInt(0,citys.length-1);
        return citys[idx];
    }

    /**
     * @Title: randomLonLat
     * @Description: 在矩形内随机生成经纬度
     * @param MinLon：最新经度  MaxLon： 最大经度   MinLat：最新纬度   MaxLat：最大纬度    type：设置返回经度还是纬度
     * @return
     * @throws
     */
    public static Double randomLonLat(double MinLon, double MaxLon, double MinLat, double MaxLat, String type) {
        Random random = new Random();
        BigDecimal db = new BigDecimal(Math.random() * (MaxLon - MinLon) + MinLon);
        Double lon = db.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();// 小数后6位
        db = new BigDecimal(Math.random() * (MaxLat - MinLat) + MinLat);
        Double lat = db.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
        if (type.equals("Lon")) {
            return lon;
        } else {
            return lat;
        }
    }

    public static String append(String url, Map<String,Object> params){
        String baseUrl = url.toString();
        if(params != null && !params.isEmpty()) {
            StringBuilder result = new StringBuilder(baseUrl);
            addPathSeparator(baseUrl, result);
            addParamPrefix(baseUrl, result);
            Iterator<?> iterator = params.entrySet().iterator();
            Map.Entry<?, ?> entry = (Map.Entry)iterator.next();
            result.append(entry.getKey().toString());
            result.append('=');
            Object value = entry.getValue();
            if(value != null) {
                result.append(value);
            }

            while(iterator.hasNext()) {
                result.append('&');
                entry = (Map.Entry)iterator.next();
                result.append(entry.getKey().toString());
                result.append('=');
                value = entry.getValue();
                if(value != null) {
                    result.append(value);
                }
            }

            return result.toString();
        } else {
            return baseUrl;
        }
    }

    private static StringBuilder addPathSeparator(final String baseUrl,
                                                  final StringBuilder result) {
        // Add trailing slash if the base URL doesn't have any path segments.
        //
        // The following test is checking for the last slash not being part of
        // the protocol to host separator: '://'.
        if (baseUrl.indexOf(':') + 2 == baseUrl.lastIndexOf('/'))
            result.append('/');
        return result;
    }

    private static StringBuilder addParamPrefix(final String baseUrl,
                                                final StringBuilder result) {
        // Add '?' if missing and add '&' if params already exist in base url
        final int queryStart = baseUrl.indexOf('?');
        final int lastChar = result.length() - 1;
        if (queryStart == -1)
            result.append('?');
        else if (queryStart < lastChar && baseUrl.charAt(lastChar) != '&')
            result.append('&');
        return result;
    }
    public static String encode(final CharSequence url)
            throws HttpRequest.HttpRequestException {
        URL parsed;
        try {
            parsed = new URL(url.toString());
        } catch (IOException e) {
            throw new HttpRequest.HttpRequestException(e);
        }

        String host = parsed.getHost();
        int port = parsed.getPort();
        if (port != -1)
            host = host + ':' + Integer.toString(port);

        try {
            String encoded = new URI(parsed.getProtocol(), host, parsed.getPath(),
                    parsed.getQuery(), null).toASCIIString();
            int paramsStart = encoded.indexOf('?');
            if (paramsStart > 0 && paramsStart + 1 < encoded.length())
                encoded = encoded.substring(0, paramsStart + 1)
                        + encoded.substring(paramsStart + 1).replace("+", "%2B");
            return encoded;
        } catch (URISyntaxException e) {
            IOException io = new IOException("Parsing URI failed");
            io.initCause(e);
            throw new HttpRequest.HttpRequestException(io);
        }
    }



}
