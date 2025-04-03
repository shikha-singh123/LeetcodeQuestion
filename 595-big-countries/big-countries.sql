# Write your MySQL query statement below

-- Select  name,population,area 
--  from World 
--  where
--  area>=300000 AND population>=25000000 ;

 select name, population, area from World where area>=3000000 or population>=25000000;