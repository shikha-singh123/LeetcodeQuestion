# Write your MySQL query statement below
select user_id,name,mail
from users
where mail like "%@leetcode.com"
AND mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$';
