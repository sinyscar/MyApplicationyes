package com.example.vkeline.myapplication.data;

import com.bigkoo.pickerview.model.IPickerViewData;

import java.util.ArrayList;

/**
 * Created by vkeline on 2018/2/27.
 */
public class DiquDatas {

    private ArrayList<ProvinceBean> options1Items = new ArrayList<>();
    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<IPickerViewData>>> options3Items = new ArrayList<>();

    public DiquDatas() {
        //选项1
        options1Items.add(new ProvinceBean(0, "河北", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(1, "山西", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(2, "内蒙古", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(3, "辽宁", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(4, "吉林", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(5, "黑龙江", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(6, "江苏", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(7, "浙江", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(8, "安徽", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(9, "福建", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(10, "江西", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(11, "山东", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(12, "河南", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(13, "湖北", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(14, "湖南", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(15, "广东", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(16, "广西", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(17, "海南", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(18, "四川", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(19, "贵州", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(20, "云南", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(21, "西藏", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(22, "陕西", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(23, "甘肃", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(24, "青海", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(25, "宁夏", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(26, "新疆", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(27, "香港", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(28, "澳门", "描述部分", "其他数据"));
        options1Items.add(new ProvinceBean(29, "台湾", "描述部分", "其他数据"));


        //选项2
        ArrayList<String> options2Items_01 = new ArrayList<>();
        options2Items_01.add("石家庄");
        options2Items_01.add("保定");
        options2Items_01.add("秦皇岛");
        options2Items_01.add("唐山");
        options2Items_01.add("邯郸");
        options2Items_01.add("邢台");
        options2Items_01.add("沧州");
        options2Items_01.add("承德");
        options2Items_01.add("廊坊");
        options2Items_01.add("衡水");
        options2Items_01.add("张家口");
        ArrayList<String> options2Items_02 = new ArrayList<>();
        options2Items_02.add("太原");
        options2Items_02.add("大同");
        options2Items_02.add("阳泉");
        options2Items_02.add("长治");
        options2Items_02.add("临汾");
        options2Items_02.add("晋中");
        options2Items_02.add("运城");
        options2Items_02.add("晋城");
        options2Items_02.add("忻州");
        options2Items_02.add("朔州");
        options2Items_02.add("吕梁");
        ArrayList<String> options2Items_03 = new ArrayList<>();
        options2Items_03.add("呼和浩特");
        options2Items_03.add("呼伦贝尔");
        options2Items_03.add("包头");
        options2Items_03.add("赤峰");
        options2Items_03.add("乌海");
        options2Items_03.add("通辽");
        options2Items_03.add("鄂尔多斯");
        options2Items_03.add("乌兰察布");
        options2Items_03.add("巴彦淖尔");
        ArrayList<String> options2Items_04 = new ArrayList<>();
        options2Items_04.add("盘锦");
        options2Items_04.add("鞍山");
        options2Items_04.add("抚顺");
        options2Items_04.add("本溪");
        options2Items_04.add("铁岭");
        options2Items_04.add("锦州");
        options2Items_04.add("丹东");
        options2Items_04.add("辽阳");
        options2Items_04.add("葫芦岛");
        options2Items_04.add("阜新");
        options2Items_04.add("朝阳");
        options2Items_04.add("营口");
        ArrayList<String> options2Items_05 = new ArrayList<>();
        options2Items_05.add("吉林");
        options2Items_05.add("通化");
        options2Items_05.add("白城");
        options2Items_05.add("四平");
        options2Items_05.add("辽源");
        options2Items_05.add("松原");
        options2Items_05.add("白山");
        ArrayList<String> options2Items_06 = new ArrayList<>();
        options2Items_06.add("伊春");
        options2Items_06.add("牡丹江");
        options2Items_06.add("大庆");
        options2Items_06.add("鸡西");
        options2Items_06.add("鹤岗");
        options2Items_06.add("绥化");
        options2Items_06.add("双鸭山");
        options2Items_06.add("七台河");
        options2Items_06.add("佳木斯");
        options2Items_06.add("黑河");
        options2Items_06.add("齐齐哈尔");
        ArrayList<String> options2Items_07 = new ArrayList<>();
        options2Items_07.add("无锡");
        options2Items_07.add("常州");
        options2Items_07.add("扬州");
        options2Items_07.add("徐州");
        options2Items_07.add("苏州");
        options2Items_07.add("连云港");
        options2Items_07.add("盐城");
        options2Items_07.add("淮安");
        options2Items_07.add("宿迁");
        options2Items_07.add("镇江");
        options2Items_07.add("南通");
        options2Items_07.add("泰州");
        ArrayList<String> options2Items_08 = new ArrayList<>();
        options2Items_08.add("绍兴");
        options2Items_08.add("温州");
        options2Items_08.add("湖州");
        options2Items_08.add("嘉兴");
        options2Items_08.add("台州");
        options2Items_08.add("金华");
        options2Items_08.add("舟山");
        options2Items_08.add("衢州");
        options2Items_08.add("丽水");
        ArrayList<String> options2Items_09 = new ArrayList<>();
        options2Items_09.add("合肥");
        options2Items_09.add("芜湖");
        options2Items_09.add("亳州");
        options2Items_09.add("马鞍山");
        options2Items_09.add("池州");
        options2Items_09.add("淮南");
        options2Items_09.add("淮北");
        options2Items_09.add("蚌埠");
        options2Items_09.add("巢湖");
        options2Items_09.add("安庆");
        options2Items_09.add("宿州");
        options2Items_09.add("宣城");
        options2Items_09.add("滁州");
        options2Items_09.add("黄山");
        options2Items_09.add("六安");
        options2Items_09.add("阜阳");
        options2Items_09.add("铜陵");
        ArrayList<String> options2Items_10 = new ArrayList<>();
        options2Items_10.add("福州");
        options2Items_10.add("泉州");
        options2Items_10.add("漳州");
        options2Items_10.add("南平");
        options2Items_10.add("三明");
        options2Items_10.add("龙岩");
        options2Items_10.add("莆田");
        options2Items_10.add("宁德");
        ArrayList<String> options2Items_11 = new ArrayList<>();
        options2Items_11.add("南昌");
        options2Items_11.add("赣州");
        options2Items_11.add("景德镇");
        options2Items_11.add("九江");
        options2Items_11.add("萍乡");
        options2Items_11.add("新余");
        options2Items_11.add("抚州");
        options2Items_11.add("宜春");
        options2Items_11.add("上饶");
        options2Items_11.add("鹰潭");
        options2Items_11.add("吉安");
        ArrayList<String> options2Items_12 = new ArrayList<>();
        options2Items_12.add("潍坊");
        options2Items_12.add("淄博");
        options2Items_12.add("威海");
        options2Items_12.add("枣庄");
        options2Items_12.add("泰安");
        options2Items_12.add("临沂");
        options2Items_12.add("东营");
        options2Items_12.add("济宁");
        options2Items_12.add("烟台");
        options2Items_12.add("菏泽");
        options2Items_12.add("日照");
        options2Items_12.add("德州");
        options2Items_12.add("聊城");
        options2Items_12.add("滨州");
        options2Items_12.add("莱芜");
        ArrayList<String> options2Items_13 = new ArrayList<>();
        options2Items_13.add("郑州");
        options2Items_13.add("洛阳");
        options2Items_13.add("焦作");
        options2Items_13.add("商丘");
        options2Items_13.add("信阳");
        options2Items_13.add("新乡");
        options2Items_13.add("安阳");
        options2Items_13.add("开封");
        options2Items_13.add("漯河");
        options2Items_13.add("南阳");
        options2Items_13.add("鹤壁");
        options2Items_13.add("平顶山");
        options2Items_13.add("濮阳");
        options2Items_13.add("许昌");
        options2Items_13.add("周口");
        options2Items_13.add("三门峡");
        options2Items_13.add("驻马店");
        ArrayList<String> options2Items_14 = new ArrayList<>();
        options2Items_14.add("荆门");
        options2Items_14.add("咸宁");
        options2Items_14.add("襄樊");
        options2Items_14.add("荆州");
        options2Items_14.add("黄石");
        options2Items_14.add("宜昌");
        options2Items_14.add("随州");
        options2Items_14.add("鄂州");
        options2Items_14.add("孝感");
        options2Items_14.add("黄冈");
        options2Items_14.add("十堰");
        ArrayList<String> options2Items_15 = new ArrayList<>();
        options2Items_15.add("长沙");
        options2Items_15.add("郴州");
        options2Items_15.add("娄底");
        options2Items_15.add("衡阳");
        options2Items_15.add("株洲");
        options2Items_15.add("湘潭");
        options2Items_15.add("岳阳");
        options2Items_15.add("常德");
        options2Items_15.add("邵阳");
        options2Items_15.add("益阳");
        options2Items_15.add("永州");
        options2Items_15.add("张家界");
        options2Items_15.add("怀化");
        ArrayList<String> options2Items_16 = new ArrayList<>();
        options2Items_16.add("江门");
        options2Items_16.add("佛山");
        options2Items_16.add("汕头");
        options2Items_16.add("湛江");
        options2Items_16.add("韶关");
        options2Items_16.add("中山");
        options2Items_16.add("珠海");
        options2Items_16.add("茂名");
        options2Items_16.add("肇庆");
        options2Items_16.add("阳江");
        options2Items_16.add("惠州");
        options2Items_16.add("潮州");
        options2Items_16.add("揭阳");
        options2Items_16.add("清远");
        options2Items_16.add("河源");
        options2Items_16.add("东莞");
        options2Items_16.add("汕尾");
        options2Items_16.add("云浮");
        ArrayList<String> options2Items_17 = new ArrayList<>();
        options2Items_17.add("南宁");
        options2Items_17.add("贺州");
        options2Items_17.add("柳州");
        options2Items_17.add("桂林");
        options2Items_17.add("梧州");
        options2Items_17.add("北海");
        options2Items_17.add("玉林");
        options2Items_17.add("钦州");
        options2Items_17.add("百色");
        options2Items_17.add("防城");
        options2Items_17.add("贵港");
        options2Items_17.add("河池");
        options2Items_17.add("崇左");
        options2Items_17.add("来宾");
        ArrayList<String> options2Items_18 = new ArrayList<>();
        options2Items_18.add("海口");
        options2Items_18.add("三亚");
        ArrayList<String> options2Items_19 = new ArrayList<>();
        options2Items_19.add("乐山");
        options2Items_19.add("雅安");
        options2Items_19.add("广安");
        options2Items_19.add("南充");
        options2Items_19.add("自贡");
        options2Items_19.add("泸州");
        options2Items_19.add("内江");
        options2Items_19.add("宜宾");
        options2Items_19.add("广元");
        options2Items_19.add("达州");
        options2Items_19.add("资阳");
        options2Items_19.add("绵阳");
        options2Items_19.add("眉山");
        options2Items_19.add("巴中");
        options2Items_19.add("攀枝花");
        options2Items_19.add("遂宁");
        options2Items_19.add("德阳");
        ArrayList<String> options2Items_20 = new ArrayList<>();
        options2Items_20.add("贵阳");
        options2Items_20.add("安顺");
        options2Items_20.add("遵义");
        options2Items_20.add("六盘水");
        ArrayList<String> options2Items_21 = new ArrayList<>();
        options2Items_21.add("昆明");
        options2Items_21.add("玉溪");
        options2Items_21.add("大理");
        options2Items_21.add("曲靖");
        options2Items_21.add("昭通");
        options2Items_21.add("保山");
        options2Items_21.add("丽江");
        options2Items_21.add("临沧");
        ArrayList<String> options2Items_22 = new ArrayList<>();
        options2Items_22.add("拉萨");
        options2Items_22.add("阿里");
        ArrayList<String> options2Items_23 = new ArrayList<>();
        options2Items_23.add("咸阳");
        options2Items_23.add("榆林");
        options2Items_23.add("宝鸡");
        options2Items_23.add("铜川");
        options2Items_23.add("渭南");
        options2Items_23.add("汉中");
        options2Items_23.add("安康");
        options2Items_23.add("商洛");
        options2Items_23.add("延安");
        ArrayList<String> options2Items_24 = new ArrayList<>();
        options2Items_24.add("兰州");
        options2Items_24.add("白银");
        options2Items_24.add("武威");
        options2Items_24.add("金昌");
        options2Items_24.add("平凉");
        options2Items_24.add("张掖");
        options2Items_24.add("嘉峪关");
        options2Items_24.add("酒泉");
        options2Items_24.add("庆阳");
        options2Items_24.add("定西");
        options2Items_24.add("陇南");
        options2Items_24.add("天水");
        ArrayList<String> options2Items_25 = new ArrayList<>();
        options2Items_25.add("西宁");
        ArrayList<String> options2Items_26 = new ArrayList<>();
        options2Items_26.add("银川");
        options2Items_26.add("固原");
        options2Items_26.add("青铜峡");
        options2Items_26.add("石嘴山");
        options2Items_26.add("中卫");
        ArrayList<String> options2Items_27 = new ArrayList<>();
        options2Items_27.add("乌鲁木齐");
        options2Items_27.add("克拉玛依");
        ArrayList<String> options2Items_28 = new ArrayList<>();
        options2Items_28.add("香港岛");
        options2Items_28.add("九龙");
        options2Items_28.add("新界");
        options2Items_28.add("新界西");
        ArrayList<String> options2Items_29 = new ArrayList<>();
        options2Items_29.add("澳门半岛");
        options2Items_29.add("澳门离岛");
        ArrayList<String> options2Items_30 = new ArrayList<>();
        options2Items_30.add("基隆");
        options2Items_30.add("台中");
        options2Items_30.add("新竹");
        options2Items_30.add("台南");
        options2Items_30.add("嘉义");
        options2Items.add(options2Items_01);
        options2Items.add(options2Items_02);
        options2Items.add(options2Items_03);
        options2Items.add(options2Items_04);
        options2Items.add(options2Items_05);
        options2Items.add(options2Items_06);
        options2Items.add(options2Items_07);
        options2Items.add(options2Items_08);
        options2Items.add(options2Items_09);
        options2Items.add(options2Items_10);
        options2Items.add(options2Items_11);
        options2Items.add(options2Items_12);
        options2Items.add(options2Items_13);
        options2Items.add(options2Items_14);
        options2Items.add(options2Items_15);
        options2Items.add(options2Items_16);
        options2Items.add(options2Items_17);
        options2Items.add(options2Items_18);
        options2Items.add(options2Items_19);
        options2Items.add(options2Items_20);
        options2Items.add(options2Items_21);
        options2Items.add(options2Items_22);
        options2Items.add(options2Items_23);
        options2Items.add(options2Items_24);
        options2Items.add(options2Items_25);
        options2Items.add(options2Items_26);
        options2Items.add(options2Items_27);
        options2Items.add(options2Items_28);
        options2Items.add(options2Items_29);
        options2Items.add(options2Items_30);
    }

    public ArrayList<ProvinceBean> getOptions1Items() {
        return options1Items;
    }

    public void setOptions1Items(ArrayList<ProvinceBean> options1Items) {
        this.options1Items = options1Items;
    }

    public ArrayList<ArrayList<String>> getOptions2Items() {
        return options2Items;
    }

    public void setOptions2Items(ArrayList<ArrayList<String>> options2Items) {
        this.options2Items = options2Items;
    }

    public ArrayList<ArrayList<ArrayList<IPickerViewData>>> getOptions3Items() {
        return options3Items;
    }

    public void setOptions3Items(ArrayList<ArrayList<ArrayList<IPickerViewData>>> options3Items) {
        this.options3Items = options3Items;
    }



}
