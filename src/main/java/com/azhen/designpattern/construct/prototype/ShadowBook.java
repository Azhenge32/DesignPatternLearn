package com.azhen.designpattern.construct.prototype;

import java.awt.print.Book;
import java.util.ArrayList;

public class ShadowBook implements Cloneable {

    private String title;// 标题
    private ArrayList<String> image = new ArrayList<String>();// 图片名列表

    public ShadowBook() {
        super();
    }

    /**
     * 重写拷贝方法
     */
    @Override
    protected ShadowBook clone()  {
        try {
            ShadowBook book = (ShadowBook) super.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void addImage(String img) {
        this.image.add(img);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 打印内容
     */
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title：" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}
