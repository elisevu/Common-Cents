import java.util.*;
import java.io.*;
//budget = [bills, groceries, necessities, savings]
//budget_percentages = [bi_percent, gr_percent, cl_percent, ot_percent]

public class Budget()
{
   double salary = 0; //quiz.getSalary
   double balance = 0; //quiz.getBalance
   double percent = 0;
   double[] budget = new double[priorities.size()];
   public double[] getBudget (String user, List priorities) {
      for (int i=0;i<priorities.size();i++)  {
         if (i == 1)
            percent = 0.5;
         else if (i == 2)
            percent = 0.3;
         else if (i == 3 || i == 4)
            percent = 0.1;
         budget[i] = user.getBalance() - (balance*percent);
      }
      return budget;
   }
   public void setBalance(double diff, boolean add){
      double old = balance;
      if (add)
         balance += diff;
      else
         balance -= diff;
      setBudget(balance, priorities);
   }
   public void setBudget(String item, double down){
      for (int i=0; i<priorities.size();i++){
         if (item.equals(priorities.get(i))) {
            budget[i] = budget[i] + down;
         }
         else {
            budget[i] = budget[i] - down;
         }
      }
   }
}