package com.proxy;

/**
 * @author Slience
 * @version 1.0
 *
 * 假设访问是需要进行加解密处理，否则访问失败
 */

public class ChromeBrowser implements Browser {
    @Override
    public void visitInternet() {
        System.out.println("use ChromeBrowser visitInternet");
    }

    public void listenMusic() {
        System.out.println("use ChromeBrowser listenMusic");
    }

}
// 入侵原有代码，采用 ChromeBrowserProxy
//public class ChromeBrowser implements Browser {
//
//    @Override
//    public void visitInternet() {
//        encrypt();
//        System.out.println("use ChromeBrowser visitInternet");
//        decrypt();
//    }
//
//
//    private void encrypt(){
//        System.out.println("encrypt 加密处理");
//    }
//    private void decrypt(){
//        System.out.println("decrypt 解密处理");
//    }
//}
