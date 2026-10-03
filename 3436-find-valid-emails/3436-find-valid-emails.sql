/* Write your T-SQL query statement below */
SELECT user_id, email
FROM Users
WHERE email NOT LIKE '%[^A-Za-z0-9_]%@%'
  AND email NOT LIKE '%@%[^A-Za-z]%.com'
  AND email LIKE '%@[A-Za-z]%.com'
ORDER BY user_id;