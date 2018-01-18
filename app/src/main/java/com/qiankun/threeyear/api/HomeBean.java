package com.qiankun.threeyear.api;

import java.io.Serializable;
import java.util.List;

/**
 * Created by QKun on 2018/1/9.
 */

public class HomeBean implements Serializable{

    /**
     * dietary : {"id":1,"name":"涨力量菜","tuijiandu":"2","jijie":"4","zhendui":"力量素质","cailiao":"冬瓜肉","miaoshu":"白嫩","yingyangzhi":56,"imageurl":"/touxiang/3239f73428d740a8954ec51aa615b13f.png"}
     * social : {"id":144,"socialid":144,"studentid":175,"xuejihao":"14211868","studentname":"刘聿航","schoolid":1,"schoolname":"北京市第一小学","content":"","imageurl":"/social/20180109/279dcc5a361e48c088f77255fda975ce.png","imageurlList":null,"senddate":"2018-01-09 09:42","likenumber":3,"sonnumber":4,"islike":1,"touxiangurl":"/touxiang/20180106/3e1e64634a4c4537bcdc8b1e8f1dee7a.png","deletedate":null,"delflag":0,"socialSonList":null}
     * measurements : {"id":141,"xuejihao":"14211586","schoolid":1,"schoolcode":"test","schoolname":"北京市第一小学","nid":11,"ncode":"14","nname":"四年级","bid":18,"bcode":"1403","bname":"3班","studentid":141,"studentname":"许文俊","height":136.9,"weight":30.2,"feihuoliang":2071,"wushimi":9.3,"zuotiweiqianqu":13.4,"tiaosheng":155,"yangwoqizuo":29,"wushimibawangfan":null,"lidingtiaoyuan":null,"yintixiangshang":null,"yiqianmi":null,"babaimi":null,"celiangdate":"2017-12-18 00:00:00","heightdf":null,"heightpd":null,"weightdf":null,"weightpd":null,"bmidf":100,"bmipd":"正常","feihuoliangdf":80,"feihuoliangpd":"优秀","wushimidf":78,"wushimipd":"及格","zuotiweiqianqudf":85,"zuotiweiqianqupd":"优秀","tiaoshengdf":72,"tiaoshengpd":"及格","yangwoqizuodf":72,"yangwoqizuopd":"及格","wushimibawangfandf":null,"wushimibawangfanpd":null,"lidingtiaoyuandf":null,"lidingtiaoyuanpd":null,"yintixiangshangdf":null,"yintixiangshangpd":null,"yiqianmidf":null,"yiqianmipd":null,"babaimidf":null,"babaimipd":null,"zongtidf":95.8,"zongtipd":"优秀","creater":4,"createdtime":"2017-12-21 16:37:03","fujiafen":null,"tsfjf":null,"ytxsfjf":null,"ywqzfjf":null,"yqmfjf":null,"bbmfjf":null,"xuehao":"14211586","carid":null,"sex":"1","minzu":null,"birthday":"2008-01-17","address":null,"bmi":null,"measurementsid":141}
     */

    private DietaryBean dietary;
    private SocialBean social;
    private MeasurementsBean measurements;

    public DietaryBean getDietary() {
        return dietary;
    }

    public void setDietary(DietaryBean dietary) {
        this.dietary = dietary;
    }

    public SocialBean getSocial() {
        return social;
    }

    public void setSocial(SocialBean social) {
        this.social = social;
    }

    public MeasurementsBean getMeasurements() {
        return measurements;
    }

    public void setMeasurements(MeasurementsBean measurements) {
        this.measurements = measurements;
    }

    public static class DietaryBean implements Serializable{
        /**
         * id : 1
         * name : 涨力量菜
         * tuijiandu : 2
         * jijie : 4
         * zhendui : 力量素质
         * cailiao : 冬瓜肉
         * miaoshu : 白嫩
         * yingyangzhi : 56
         * imageurl : /touxiang/3239f73428d740a8954ec51aa615b13f.png
         */

        private int id;
        private String name;
        private String tuijiandu;
        private String jijie;
        private String zhendui;
        private String cailiao;
        private String miaoshu;
        private int yingyangzhi;
        private String imageurl;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTuijiandu() {
            return tuijiandu;
        }

        public void setTuijiandu(String tuijiandu) {
            this.tuijiandu = tuijiandu;
        }

        public String getJijie() {
            return jijie;
        }

        public void setJijie(String jijie) {
            this.jijie = jijie;
        }

        public String getZhendui() {
            return zhendui;
        }

        public void setZhendui(String zhendui) {
            this.zhendui = zhendui;
        }

        public String getCailiao() {
            return cailiao;
        }

        public void setCailiao(String cailiao) {
            this.cailiao = cailiao;
        }

        public String getMiaoshu() {
            return miaoshu;
        }

        public void setMiaoshu(String miaoshu) {
            this.miaoshu = miaoshu;
        }

        public int getYingyangzhi() {
            return yingyangzhi;
        }

        public void setYingyangzhi(int yingyangzhi) {
            this.yingyangzhi = yingyangzhi;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
    }

    public static class SocialBean implements Serializable{
        /**
         * id : 144
         * socialid : 144
         * studentid : 175
         * xuejihao : 14211868
         * studentname : 刘聿航
         * schoolid : 1
         * schoolname : 北京市第一小学
         * content :
         * imageurl : /social/20180109/279dcc5a361e48c088f77255fda975ce.png
         * imageurlList : null
         * senddate : 2018-01-09 09:42
         * likenumber : 3
         * sonnumber : 4
         * islike : 1
         * touxiangurl : /touxiang/20180106/3e1e64634a4c4537bcdc8b1e8f1dee7a.png
         * deletedate : null
         * delflag : 0
         * socialSonList : null
         */

        private int id;
        private int socialid;
        private int studentid;
        private String xuejihao;
        private String studentname;
        private int schoolid;
        private String schoolname;
        private String content;
        private String imageurl;
        private List<String> imageurlList;
        private String senddate;
        private int likenumber;
        private int sonnumber;
        private int islike;
        private String touxiangurl;
        private Object deletedate;
        private int delflag;
        private Object socialSonList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSocialid() {
            return socialid;
        }

        public void setSocialid(int socialid) {
            this.socialid = socialid;
        }

        public int getStudentid() {
            return studentid;
        }

        public void setStudentid(int studentid) {
            this.studentid = studentid;
        }

        public String getXuejihao() {
            return xuejihao;
        }

        public void setXuejihao(String xuejihao) {
            this.xuejihao = xuejihao;
        }

        public String getStudentname() {
            return studentname;
        }

        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }

        public int getSchoolid() {
            return schoolid;
        }

        public void setSchoolid(int schoolid) {
            this.schoolid = schoolid;
        }

        public String getSchoolname() {
            return schoolname;
        }

        public void setSchoolname(String schoolname) {
            this.schoolname = schoolname;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public List<String> getImageurlList() {
            return imageurlList;
        }

        public void setImageurlList(List<String> imageurlList) {
            this.imageurlList = imageurlList;
        }

        public String getSenddate() {
            return senddate;
        }

        public void setSenddate(String senddate) {
            this.senddate = senddate;
        }

        public int getLikenumber() {
            return likenumber;
        }

        public void setLikenumber(int likenumber) {
            this.likenumber = likenumber;
        }

        public int getSonnumber() {
            return sonnumber;
        }

        public void setSonnumber(int sonnumber) {
            this.sonnumber = sonnumber;
        }

        public int getIslike() {
            return islike;
        }

        public void setIslike(int islike) {
            this.islike = islike;
        }

        public String getTouxiangurl() {
            return touxiangurl;
        }

        public void setTouxiangurl(String touxiangurl) {
            this.touxiangurl = touxiangurl;
        }

        public Object getDeletedate() {
            return deletedate;
        }

        public void setDeletedate(Object deletedate) {
            this.deletedate = deletedate;
        }

        public int getDelflag() {
            return delflag;
        }

        public void setDelflag(int delflag) {
            this.delflag = delflag;
        }

        public Object getSocialSonList() {
            return socialSonList;
        }

        public void setSocialSonList(Object socialSonList) {
            this.socialSonList = socialSonList;
        }
    }

    public static class MeasurementsBean implements Serializable{
        /**
         * id : 141
         * xuejihao : 14211586
         * schoolid : 1
         * schoolcode : test
         * schoolname : 北京市第一小学
         * nid : 11
         * ncode : 14
         * nname : 四年级
         * bid : 18
         * bcode : 1403
         * bname : 3班
         * studentid : 141
         * studentname : 许文俊
         * height : 136.9
         * weight : 30.2
         * feihuoliang : 2071
         * wushimi : 9.3
         * zuotiweiqianqu : 13.4
         * tiaosheng : 155
         * yangwoqizuo : 29
         * wushimibawangfan : null
         * lidingtiaoyuan : null
         * yintixiangshang : null
         * yiqianmi : null
         * babaimi : null
         * celiangdate : 2017-12-18 00:00:00
         * heightdf : null
         * heightpd : null
         * weightdf : null
         * weightpd : null
         * bmidf : 100
         * bmipd : 正常
         * feihuoliangdf : 80
         * feihuoliangpd : 优秀
         * wushimidf : 78
         * wushimipd : 及格
         * zuotiweiqianqudf : 85
         * zuotiweiqianqupd : 优秀
         * tiaoshengdf : 72
         * tiaoshengpd : 及格
         * yangwoqizuodf : 72
         * yangwoqizuopd : 及格
         * wushimibawangfandf : null
         * wushimibawangfanpd : null
         * lidingtiaoyuandf : null
         * lidingtiaoyuanpd : null
         * yintixiangshangdf : null
         * yintixiangshangpd : null
         * yiqianmidf : null
         * yiqianmipd : null
         * babaimidf : null
         * babaimipd : null
         * zongtidf : 95.8
         * zongtipd : 优秀
         * creater : 4
         * createdtime : 2017-12-21 16:37:03
         * fujiafen : null
         * tsfjf : null
         * ytxsfjf : null
         * ywqzfjf : null
         * yqmfjf : null
         * bbmfjf : null
         * xuehao : 14211586
         * carid : null
         * sex : 1
         * minzu : null
         * birthday : 2008-01-17
         * address : null
         * bmi : null
         * measurementsid : 141
         */

        private int id;
        private String xuejihao;
        private int schoolid;
        private String schoolcode;
        private String schoolname;
        private int nid;
        private String ncode;
        private String nname;
        private int bid;
        private String bcode;
        private String bname;
        private int studentid;
        private String studentname;
        private double height;
        private double weight;
        private int feihuoliang;
        private double wushimi;
        private double zuotiweiqianqu;
        private int tiaosheng;
        private int yangwoqizuo;
        private Object wushimibawangfan;
        private Object lidingtiaoyuan;
        private Object yintixiangshang;
        private Object yiqianmi;
        private Object babaimi;
        private String celiangdate;
        private Object heightdf;
        private Object heightpd;
        private Object weightdf;
        private Object weightpd;
        private int bmidf;
        private String bmipd;
        private int feihuoliangdf;
        private String feihuoliangpd;
        private int wushimidf;
        private String wushimipd;
        private int zuotiweiqianqudf;
        private String zuotiweiqianqupd;
        private int tiaoshengdf;
        private String tiaoshengpd;
        private int yangwoqizuodf;
        private String yangwoqizuopd;
        private Object wushimibawangfandf;
        private Object wushimibawangfanpd;
        private Object lidingtiaoyuandf;
        private Object lidingtiaoyuanpd;
        private Object yintixiangshangdf;
        private Object yintixiangshangpd;
        private Object yiqianmidf;
        private Object yiqianmipd;
        private Object babaimidf;
        private Object babaimipd;
        private double zongtidf;
        private String zongtipd;
        private int creater;
        private String createdtime;
        private Object fujiafen;
        private Object tsfjf;
        private Object ytxsfjf;
        private Object ywqzfjf;
        private Object yqmfjf;
        private Object bbmfjf;
        private String xuehao;
        private Object carid;
        private String sex;
        private Object minzu;
        private String birthday;
        private Object address;
        private Object bmi;
        private int measurementsid;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getXuejihao() {
            return xuejihao;
        }

        public void setXuejihao(String xuejihao) {
            this.xuejihao = xuejihao;
        }

        public int getSchoolid() {
            return schoolid;
        }

        public void setSchoolid(int schoolid) {
            this.schoolid = schoolid;
        }

        public String getSchoolcode() {
            return schoolcode;
        }

        public void setSchoolcode(String schoolcode) {
            this.schoolcode = schoolcode;
        }

        public String getSchoolname() {
            return schoolname;
        }

        public void setSchoolname(String schoolname) {
            this.schoolname = schoolname;
        }

        public int getNid() {
            return nid;
        }

        public void setNid(int nid) {
            this.nid = nid;
        }

        public String getNcode() {
            return ncode;
        }

        public void setNcode(String ncode) {
            this.ncode = ncode;
        }

        public String getNname() {
            return nname;
        }

        public void setNname(String nname) {
            this.nname = nname;
        }

        public int getBid() {
            return bid;
        }

        public void setBid(int bid) {
            this.bid = bid;
        }

        public String getBcode() {
            return bcode;
        }

        public void setBcode(String bcode) {
            this.bcode = bcode;
        }

        public String getBname() {
            return bname;
        }

        public void setBname(String bname) {
            this.bname = bname;
        }

        public int getStudentid() {
            return studentid;
        }

        public void setStudentid(int studentid) {
            this.studentid = studentid;
        }

        public String getStudentname() {
            return studentname;
        }

        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getFeihuoliang() {
            return feihuoliang;
        }

        public void setFeihuoliang(int feihuoliang) {
            this.feihuoliang = feihuoliang;
        }

        public double getWushimi() {
            return wushimi;
        }

        public void setWushimi(double wushimi) {
            this.wushimi = wushimi;
        }

        public double getZuotiweiqianqu() {
            return zuotiweiqianqu;
        }

        public void setZuotiweiqianqu(double zuotiweiqianqu) {
            this.zuotiweiqianqu = zuotiweiqianqu;
        }

        public int getTiaosheng() {
            return tiaosheng;
        }

        public void setTiaosheng(int tiaosheng) {
            this.tiaosheng = tiaosheng;
        }

        public int getYangwoqizuo() {
            return yangwoqizuo;
        }

        public void setYangwoqizuo(int yangwoqizuo) {
            this.yangwoqizuo = yangwoqizuo;
        }

        public Object getWushimibawangfan() {
            return wushimibawangfan;
        }

        public void setWushimibawangfan(Object wushimibawangfan) {
            this.wushimibawangfan = wushimibawangfan;
        }

        public Object getLidingtiaoyuan() {
            return lidingtiaoyuan;
        }

        public void setLidingtiaoyuan(Object lidingtiaoyuan) {
            this.lidingtiaoyuan = lidingtiaoyuan;
        }

        public Object getYintixiangshang() {
            return yintixiangshang;
        }

        public void setYintixiangshang(Object yintixiangshang) {
            this.yintixiangshang = yintixiangshang;
        }

        public Object getYiqianmi() {
            return yiqianmi;
        }

        public void setYiqianmi(Object yiqianmi) {
            this.yiqianmi = yiqianmi;
        }

        public Object getBabaimi() {
            return babaimi;
        }

        public void setBabaimi(Object babaimi) {
            this.babaimi = babaimi;
        }

        public String getCeliangdate() {
            return celiangdate;
        }

        public void setCeliangdate(String celiangdate) {
            this.celiangdate = celiangdate;
        }

        public Object getHeightdf() {
            return heightdf;
        }

        public void setHeightdf(Object heightdf) {
            this.heightdf = heightdf;
        }

        public Object getHeightpd() {
            return heightpd;
        }

        public void setHeightpd(Object heightpd) {
            this.heightpd = heightpd;
        }

        public Object getWeightdf() {
            return weightdf;
        }

        public void setWeightdf(Object weightdf) {
            this.weightdf = weightdf;
        }

        public Object getWeightpd() {
            return weightpd;
        }

        public void setWeightpd(Object weightpd) {
            this.weightpd = weightpd;
        }

        public int getBmidf() {
            return bmidf;
        }

        public void setBmidf(int bmidf) {
            this.bmidf = bmidf;
        }

        public String getBmipd() {
            return bmipd;
        }

        public void setBmipd(String bmipd) {
            this.bmipd = bmipd;
        }

        public int getFeihuoliangdf() {
            return feihuoliangdf;
        }

        public void setFeihuoliangdf(int feihuoliangdf) {
            this.feihuoliangdf = feihuoliangdf;
        }

        public String getFeihuoliangpd() {
            return feihuoliangpd;
        }

        public void setFeihuoliangpd(String feihuoliangpd) {
            this.feihuoliangpd = feihuoliangpd;
        }

        public int getWushimidf() {
            return wushimidf;
        }

        public void setWushimidf(int wushimidf) {
            this.wushimidf = wushimidf;
        }

        public String getWushimipd() {
            return wushimipd;
        }

        public void setWushimipd(String wushimipd) {
            this.wushimipd = wushimipd;
        }

        public int getZuotiweiqianqudf() {
            return zuotiweiqianqudf;
        }

        public void setZuotiweiqianqudf(int zuotiweiqianqudf) {
            this.zuotiweiqianqudf = zuotiweiqianqudf;
        }

        public String getZuotiweiqianqupd() {
            return zuotiweiqianqupd;
        }

        public void setZuotiweiqianqupd(String zuotiweiqianqupd) {
            this.zuotiweiqianqupd = zuotiweiqianqupd;
        }

        public int getTiaoshengdf() {
            return tiaoshengdf;
        }

        public void setTiaoshengdf(int tiaoshengdf) {
            this.tiaoshengdf = tiaoshengdf;
        }

        public String getTiaoshengpd() {
            return tiaoshengpd;
        }

        public void setTiaoshengpd(String tiaoshengpd) {
            this.tiaoshengpd = tiaoshengpd;
        }

        public int getYangwoqizuodf() {
            return yangwoqizuodf;
        }

        public void setYangwoqizuodf(int yangwoqizuodf) {
            this.yangwoqizuodf = yangwoqizuodf;
        }

        public String getYangwoqizuopd() {
            return yangwoqizuopd;
        }

        public void setYangwoqizuopd(String yangwoqizuopd) {
            this.yangwoqizuopd = yangwoqizuopd;
        }

        public Object getWushimibawangfandf() {
            return wushimibawangfandf;
        }

        public void setWushimibawangfandf(Object wushimibawangfandf) {
            this.wushimibawangfandf = wushimibawangfandf;
        }

        public Object getWushimibawangfanpd() {
            return wushimibawangfanpd;
        }

        public void setWushimibawangfanpd(Object wushimibawangfanpd) {
            this.wushimibawangfanpd = wushimibawangfanpd;
        }

        public Object getLidingtiaoyuandf() {
            return lidingtiaoyuandf;
        }

        public void setLidingtiaoyuandf(Object lidingtiaoyuandf) {
            this.lidingtiaoyuandf = lidingtiaoyuandf;
        }

        public Object getLidingtiaoyuanpd() {
            return lidingtiaoyuanpd;
        }

        public void setLidingtiaoyuanpd(Object lidingtiaoyuanpd) {
            this.lidingtiaoyuanpd = lidingtiaoyuanpd;
        }

        public Object getYintixiangshangdf() {
            return yintixiangshangdf;
        }

        public void setYintixiangshangdf(Object yintixiangshangdf) {
            this.yintixiangshangdf = yintixiangshangdf;
        }

        public Object getYintixiangshangpd() {
            return yintixiangshangpd;
        }

        public void setYintixiangshangpd(Object yintixiangshangpd) {
            this.yintixiangshangpd = yintixiangshangpd;
        }

        public Object getYiqianmidf() {
            return yiqianmidf;
        }

        public void setYiqianmidf(Object yiqianmidf) {
            this.yiqianmidf = yiqianmidf;
        }

        public Object getYiqianmipd() {
            return yiqianmipd;
        }

        public void setYiqianmipd(Object yiqianmipd) {
            this.yiqianmipd = yiqianmipd;
        }

        public Object getBabaimidf() {
            return babaimidf;
        }

        public void setBabaimidf(Object babaimidf) {
            this.babaimidf = babaimidf;
        }

        public Object getBabaimipd() {
            return babaimipd;
        }

        public void setBabaimipd(Object babaimipd) {
            this.babaimipd = babaimipd;
        }

        public double getZongtidf() {
            return zongtidf;
        }

        public void setZongtidf(double zongtidf) {
            this.zongtidf = zongtidf;
        }

        public String getZongtipd() {
            return zongtipd;
        }

        public void setZongtipd(String zongtipd) {
            this.zongtipd = zongtipd;
        }

        public int getCreater() {
            return creater;
        }

        public void setCreater(int creater) {
            this.creater = creater;
        }

        public String getCreatedtime() {
            return createdtime;
        }

        public void setCreatedtime(String createdtime) {
            this.createdtime = createdtime;
        }

        public Object getFujiafen() {
            return fujiafen;
        }

        public void setFujiafen(Object fujiafen) {
            this.fujiafen = fujiafen;
        }

        public Object getTsfjf() {
            return tsfjf;
        }

        public void setTsfjf(Object tsfjf) {
            this.tsfjf = tsfjf;
        }

        public Object getYtxsfjf() {
            return ytxsfjf;
        }

        public void setYtxsfjf(Object ytxsfjf) {
            this.ytxsfjf = ytxsfjf;
        }

        public Object getYwqzfjf() {
            return ywqzfjf;
        }

        public void setYwqzfjf(Object ywqzfjf) {
            this.ywqzfjf = ywqzfjf;
        }

        public Object getYqmfjf() {
            return yqmfjf;
        }

        public void setYqmfjf(Object yqmfjf) {
            this.yqmfjf = yqmfjf;
        }

        public Object getBbmfjf() {
            return bbmfjf;
        }

        public void setBbmfjf(Object bbmfjf) {
            this.bbmfjf = bbmfjf;
        }

        public String getXuehao() {
            return xuehao;
        }

        public void setXuehao(String xuehao) {
            this.xuehao = xuehao;
        }

        public Object getCarid() {
            return carid;
        }

        public void setCarid(Object carid) {
            this.carid = carid;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Object getMinzu() {
            return minzu;
        }

        public void setMinzu(Object minzu) {
            this.minzu = minzu;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getBmi() {
            return bmi;
        }

        public void setBmi(Object bmi) {
            this.bmi = bmi;
        }

        public int getMeasurementsid() {
            return measurementsid;
        }

        public void setMeasurementsid(int measurementsid) {
            this.measurementsid = measurementsid;
        }
    }
}
