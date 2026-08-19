CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    declare @ans int

    select @ans = salary
    from (select *,
        dense_rank() over(order by salary desc) rnk from employee
    ) x
    where x.rnk = @N

    RETURN (
        /* Write your T-SQL query statement below. */
        @ans
    );
END