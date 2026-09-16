/* Write your T-SQL query statement below */
SELECT *
FROM Users
WHERE mail COLLATE Latin1_General_100_BIN2 LIKE '[A-Za-z]%@leetcode.com'
  AND mail COLLATE Latin1_General_100_BIN2 NOT LIKE '%[^A-Za-z0-9._@-]%'
  AND mail COLLATE Latin1_General_100_BIN2 NOT LIKE '%@%@%';