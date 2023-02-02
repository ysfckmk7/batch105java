package ders30_overriding;

public class BKuslar extends AHayvanlar{
    protected void kanat(){
        System.out.println("kanatlıdırlar");
    }
    protected void solunum(){
        System.out.println("akcıgerle nefes alırlar");
    }
    protected void gaga(){
        System.out.println("gagaları vardır");
    }
    protected void cogalma(){
        System.out.println("yumurtayla cogalırlar");
    }
}
