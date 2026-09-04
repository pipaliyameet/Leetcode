/* Write your T-SQL query statement below */select department, employee, salary 
from (select e.name employee , salary, d.name department,
rank() over(partition by d.id order by salary desc) as rnk
from employee e join department d 
on e.departmentid = d.id) x
where x.rnk = 1