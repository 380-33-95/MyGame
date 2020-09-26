
package com.mycompany.mygame;


import java.util.ArrayList;



public class Blok {


  public static ArrayList<Blok> BlokList = new ArrayList<>(83);

  public Blok() {
    BlokList.add(this);
     }


  private int Index;

  public void setIndex(int ind) {
    Index = ind;
  }

  public int getIndex() {
    return Index;
  }


  private int health;

  public void setHealth(int hea) {
    health = hea;
  }

  public int getHealth() {
    return health;
  }


  private int forse;

  public void setForse(int f) {
    forse = f;
  }

  public int getForse() {
    return forse;
  }


  private long timerBoom;

  public long getTimerBoom() {
    return timerBoom;
  }

  public void setTimerBoom(long tb) {
    this.timerBoom = tb;
  }


  private int effect;

  public int getEffect() {
    return effect;
  }

  public void setEffect(int eff) {
    this.effect = eff;
  }


  private int xl;

  public int getXl() {
    return xl;
  }

  public void setXl(int x) {
    this.xl = x;
  }

  private int yl;

  public int getYl() {
    return yl;
  }

  public void setYl(int yl) {
    this.yl = y;
  }


  private  int x;
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }


  private  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }


  private int storona;

  public int getStorona() {
    return storona;
  }

  public void setStorona(int stor) {
    storona = stor;
  }

  private int KadrBoom;

  public int getKadrBoom() {
    return KadrBoom;
  }

  public void setKadrBoom(int kadr) {
    KadrBoom = kadr;
  }

  /////////boolet////peremen///
  private int booletX = x;

  public void setBooletX(int x) {
    this.booletX = x;
  }

  public int getBooletX() {
    return booletX;
  }


  private int booletY = y;

  public void setBooletY(int y) {
    this.booletY = y;
  }

  public int getBooletY() {
    return booletY;
  }


  private long timerBoolet;

  public long getTimerBoolet() {
    return timerBoolet;
  }

  public void setTimerBoolet(long tbt) {
    timerBoolet = tbt;
  }

  ///////////boolet/////go////

  ////////////////

  //TODO BLOKS
  public static Blok b00 = new Blok();   //boss vrag

  public static Blok b01 = new Blok();   //zamok vrag

  public static Blok b02 = new Blok();   //zamok vrag
  public static Blok b03 = new Blok();   //zamok vrag
  public static Blok b04 = new Blok();   //zamok vrag
  public static Blok b05 = new Blok();   //zamok vrag
  public static Blok b06 = new Blok();   //zamok vrag

  public static Blok b07 = new Blok();
  public static Blok b08 = new Blok();
  public static Blok b09 = new Blok();

  public static Blok b10 = new Blok();
  public static Blok b11 = new Blok();
  public static Blok b12 = new Blok();
  public static Blok b13 = new Blok();
  public static Blok b14 = new Blok();
  public static Blok b15 = new Blok();
  public static Blok b16 = new Blok();
  public static Blok b17 = new Blok();
  public static Blok b18 = new Blok();
  public static Blok b19 = new Blok();

  public static Blok b20 = new Blok();
  public static Blok b21 = new Blok();
  public static Blok b22 = new Blok();
  public static Blok b23 = new Blok();
  public static Blok b24 = new Blok();
  public static Blok b25 = new Blok();
  public static Blok b26 = new Blok();
  public static Blok b27 = new Blok();
  public static Blok b28 = new Blok();
  public static Blok b29 = new Blok();

  public static Blok b30 = new Blok();
  public static Blok b31 = new Blok();
  public static Blok b32 = new Blok();
  public static Blok b33 = new Blok();
  public static Blok b34 = new Blok();
  public static Blok b35 = new Blok();
  public static Blok b36 = new Blok();
  public static Blok b37 = new Blok();
  public static Blok b38 = new Blok();
  public static Blok b39 = new Blok();

  public static Blok b40 = new Blok();
  public static Blok b41 = new Blok();
  public static Blok b42 = new Blok();
  public static Blok b43 = new Blok();
  public static Blok b44 = new Blok();
  public static Blok b45 = new Blok();
  public static Blok b46 = new Blok();
  public static Blok b47 = new Blok();
  public static Blok b48 = new Blok();
  public static Blok b49 = new Blok();

  public static Blok b50 = new Blok();
  public static Blok b51 = new Blok();
  public static Blok b52 = new Blok();
  public static Blok b53 = new Blok();
  public static Blok b54 = new Blok();
  public static Blok b55 = new Blok();
  public static Blok b56 = new Blok();
  public static Blok b57 = new Blok();
  public static Blok b58 = new Blok();
  public static Blok b59 = new Blok();

  public static Blok b60 = new Blok();
  public static Blok b61 = new Blok();
  public static Blok b62 = new Blok();
  public static Blok b63 = new Blok();
  public static Blok b64 = new Blok();
  public static Blok b65 = new Blok();
  public static Blok b66 = new Blok();
  public static Blok b67 = new Blok();
  public static Blok b68 = new Blok();
  public static Blok b69 = new Blok();

  public static Blok b70 = new Blok();
  public static Blok b71 = new Blok();
  public static Blok b72 = new Blok();
  public static Blok b73 = new Blok();
  public static Blok b74 = new Blok();
  public static Blok b75 = new Blok();
  public static Blok b76 = new Blok();
  public static Blok b77 = new Blok(); //boss igrok
  public static Blok b78 = new Blok(); //zamok igrok
  public static Blok b79 = new Blok(); //zamok igrok
  public static Blok b80 = new Blok(); //zamok igrok
  public static Blok b81 = new Blok(); //zamok igrok
  public static Blok b82 = new Blok(); //zamok igrok
  public static Blok b83 = new Blok(); //zamok igrok
  public static Blok bufer = new Blok(); // blok bufer; (84)


  protected long getTimeBoolet() {
    return timerBoolet;
  }
}
