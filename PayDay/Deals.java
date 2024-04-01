
/**
 * Write a description of class PD_Deals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Deals
{
    int cost, value;
    String name;
    static ArrayList<Deals> dealsArray= new ArrayList<Deals>();
    public  Deals(String n, int c, int v){
        cost = c;
        value = v;
        name = n;
    }
    public static void makeDeals(){
        dealsArray.add(new Deals("Tippytoe Ballet School", 2000, 5000));
        dealsArray.add(new Deals("Hummungous Hippos Lts.",10000,18000));
        dealsArray.add(new Deals("Yum Yum Yogurt",5000,9000));
        dealsArray.add(new Deals("Rock More Records",10000,15000));
        dealsArray.add(new Deals("Shepards Pie Co.",3500,6500));
        dealsArray.add(new Deals("Miss Muffer's Truffets",4000,7500));
        dealsArray.add(new Deals("Teen Jeans Co.",7000,14000));
        dealsArray.add(new Deals("Galloping Golf Ball Co.",8000,12000));
        dealsArray.add(new Deals("Everglades Condo",12000,20000));
        dealsArray.add(new Deals("DispyDoodle Noodles",8000,12000));
        dealsArray.add(new Deals("Louie's Limos Inc.",6000,11000));
        dealsArray.add(new Deals("Wheels 'N' Squeals Skateboards",2000,5500));
        dealsArray.add(new Deals("Sahara Safari",9500,1400));
        dealsArray.add(new Deals("Pete's Pizza Palace",8000,12000));
        dealsArray.add(new Deals("Burgers 'N' Buns",2000,6000));
        dealsArray.add(new Deals("Fish 'N' Cheeps",3500,7000));
        dealsArray.add(new Deals("Pop's Soda Pop Inc.",3500,6000));
       
    }
    public static Deals pullDeal(){
        int randIndex = (int)(Math.random()*17+1);
        return dealsArray.get(randIndex);
    }
}