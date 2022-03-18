package com.hamitmizrak.tutorials.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;


@Controller
public class PostContructTutorials {



   /* @Autowired
    Logger LOG;*/

    //parametresiz constructor
    // because "this.LOG" is null
  /*  public PostContructTutorials() {
        LOG.info("Log info çağrıldı");
    }*/

    //bean henüz başlamadığından null  alıyoruz ve burada bağımlılığı enjecte edemiyoruz.
    //Görevi: Bir bean nesnesi oluşturulduğunda hemen oluşur.

//    @PostConstruct
//    public void init(){
//        LOG.info("Log info çağrıldı");
//    }

  /*  public static void main(String[] args) {
        PostContructTutorials beanController=new PostContructTutorials();
        System.out.println(beanController);
    }*/


}
