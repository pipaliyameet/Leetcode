/* Write your T-SQL query statement below */
select name, bonus 
from Employee e 
full join Bonus b
on e.empid = b.empid
where bonus < 1000 or b.empid is null