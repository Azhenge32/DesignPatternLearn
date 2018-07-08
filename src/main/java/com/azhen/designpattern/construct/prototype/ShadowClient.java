package com.azhen.designpattern.construct.prototype;

public class ShadowClient {
    public static void main(String[] args) {
        ShadowBook book1 = new ShadowBook();
        // 2.编辑书本，添加图片
        book1.setTitle("书1");
        book1.addImage("图1");
        book1.showBook();

        // 以原型文档为原型，拷贝一份副本
        ShadowBook book2 = (ShadowBook) book1.clone();
        book2.showBook();
        // 修改图书副本，不会影响原始书本
        book2.setTitle("书2");
        book2.showBook();

        // 再次打印原始书本
        book1.showBook();
    }
}
