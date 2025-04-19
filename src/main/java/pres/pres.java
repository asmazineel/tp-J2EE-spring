package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {
      DaoImpl dao = new DaoImpl();
      MetierImpl metier = new MetierImpl();
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
