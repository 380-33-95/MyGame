package com.mycompany.mygame;



public class NoDublePressed {

static int nc1;
static int nc2;

  public static boolean  TouchPressVerify (int nc) {
    boolean bnc;

    nc1=nc;

    if(nc1!=nc2){
        bnc=true;
        nc2=nc1;
    }
    else {
        bnc=false;
    }

      return bnc;
  }
}
