package I;

import Location.*;

public class Me implements Tourist {

    private int budget = 1000;

    @Override
    public void visit(Bohol bohol) {
        if (this.budget - bohol.bayadpamasahe() < 0){
            System.out.println("You don't have enough funds to travel to Bohol!");
        }else {
            System.out.println("Enjoying Bohol ATM!");
            budget -= bohol.bayadpamasahe();
        }
        checkBudget();
    }

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.bayadpamasahe() < 0){
            System.out.println("You don't have enough funds to travel to Boracay!");
        }else {
            System.out.println("Enjoying Boracay ATM!");
            budget -= boracay.bayadpamasahe();
        }
        checkBudget();
    }

    @Override
    public void visit(Elnido elnido) {
        if (this.budget - elnido.bayadpamasahe() < 0){
            System.out.println("You don't have enough funds to travel to El Nido!");
        }else {
            System.out.println("Enjoying El Nido ATM!");
            budget -= elnido.bayadpamasahe();
        }
        checkBudget();
    }

    @Override
    public void visit(Pagudpud pagudpud) {
        if (this.budget - pagudpud.bayadpamasahe() < 0){
            System.out.println("You don't have enough funds to travel to Pagudpud!");
        }else {
            System.out.println("Enjoying Pagudpud ATM!");
            budget -= pagudpud.bayadpamasahe();
        }
        checkBudget();
    }

    @Override
    public void visit(Pgalera pgalera) {
        if (this.budget - pgalera.bayadpamasahe() < 0){
            System.out.println("You don't have enough funds to travel to Pwerto Galera!");
        }else {
            System.out.println("Enjoying Pwerto Galera ATM!");
            budget -= pgalera.bayadpamasahe();
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
