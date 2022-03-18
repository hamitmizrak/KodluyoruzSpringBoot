package com.hamitmizrak.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;


    //başlangıç
    public void initialBeanMethod44(){
        log.info("Bean başlamadan önce ben varım ");
        System.out.println("Bean başlamadan önce çalışacak method");
    }

    //bitiş
    public void destroyBeanMethod44(){
        log.info("Bean bittikten sonra  ben varım ");
        System.err.println("Bean bittikten sonra çalışacak method");
    }
}
