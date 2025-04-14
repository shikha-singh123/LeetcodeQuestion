# Write your MySQL query statement below

SELECT a.actor_id, a.director_id
FROM ActorDirector a
GROUP BY  actor_id,director_id
HAVING COUNT(timestamp)>=3