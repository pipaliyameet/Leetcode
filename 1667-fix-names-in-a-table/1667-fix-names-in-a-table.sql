/* Write your T-SQL query statement below */
select user_id, Upper(SUBSTRING(name, 1, 1)) + Lower(SUBSTRING(name, 2, len(name))) as name
from users
order by user_id