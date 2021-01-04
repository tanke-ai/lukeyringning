package com.bb.common.enums;

import lombok.Getter;

@Getter
public  enum GameIdEnum {
    SHUANGSEQIUe(1,"shuangseqiu"),
    FUCAI(2,"3d"),
    QICAILE(3,"15xuan5"),
    DONGFANG6JIA1(4,"dongfang6jia1"),
    PK10(5,"pk10"),
    PAILIE5(7,"pailie5"),
    PAILIE3(8,"pailie3"),
    CHONGQINGSSC(9,"shishicai/chongqing"),
    SHISHICAITIANJIN(10,"shishicai/tianjing"),





    ;

   /* private String path;
    private int status;*/
   private int id;
    private String path;


    GameIdEnum(int id ,String path) {
        this.id = id;
        this.path = path;

    }
}