import random
#budget = [bills, groceries, necessities, savings]
#budget_percentages = [bi_percent, gr_percent, cl_percent, ot_percent]

class my_budget:
    salary = 0 #quiz.getSalary
    balance = 0 #quiz.getBalance
    budget = {}
    def get_budget(user, priorities):
        for x in range(len(priorities)):
            if x == 1:
                percent = 0.5
            else if x == 2:
                percent = 0.2
            else if x == 3 or x == 4:
                percent = 0.1
            budget[priorities[x]] = user.getBalance - (balance*percent)
        return budget


    def change_balance(self, diff, add=True):
        if add == True:
            balance += diff
        else:
            balance -= diff
        budget.change_budget(balance)
        return None

    def change_budget(self, item, down):
        for x in budget.keys():
            if item is x:
                temp = budget[x]
                budget[x] = budget[x] + down
            else:
                budget[x] -= down
        return None
