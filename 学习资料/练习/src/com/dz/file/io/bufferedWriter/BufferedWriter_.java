package com.dz.file.io.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) {
        String writer = "D:\\JAVA\\io\\fileWriter.txt";
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(writer,true));
            String line = "柒木温馨提示:具体的规格和价格可点击立即购买查看，有需要实物图的或其他详情的可点击我想要联系客服咨询。\n" +
                    "❗❗下单必看：❗❗\n" +
                    "港澳台地区、新疆、西藏、青海等部分地区无法发货。其他因国家、地区政府管制（如疫情）等影响而无法发货的地区，我们也会第一时间联系您处理，给您带来不便还望谅解。◕‿◕\n" +
                    "✿48小时内发货，快递随机不指定\n" +
                    "！！！签收之前，请仔细检查包装内的产品，如有破损严重麻烦拍照给客服，并拒收。\n" +
                    "❥品牌直营，全新正品\n" +
                    "❥质量保证，售后无忧\n" +
                    "❥【全新发货，能下单就是有货】";
            bufferedWriter.write(line);
            bufferedWriter.newLine();//换行符
            bufferedWriter.write("柒木6666666");
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
