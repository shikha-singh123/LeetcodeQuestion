# Write your MySQL query statement below
Select name from Customer 
where  referee_id  IS null OR  referee_id  NOT IN(
    Select referee_id from Customer where  referee_id =2
);

-- SELECT name FROM Customer 
-- WHERE referee_id IS NULL OR referee_id NOT IN (
--     SELECT id FROM Customer WHERE referee_id = 2
-- );
