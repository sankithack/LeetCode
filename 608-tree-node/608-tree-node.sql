# Write your MySQL query statement below
#Selecting Root Node
SELECT id, "Root" AS type FROM tree
WHERE p_id is NULL
UNION
#Selecting Leaf Node
SELECT id, "Leaf" AS type FROM tree
WHERE id NOT IN(SELECT DISTINCT p_id FROM tree WHERE p_id IS NOT NULL)
AND p_id IS NOT NULL
#Selecting Inner Node
UNION
SELECT id, "Inner" AS type FROM tree
WHERE id IN(SELECT DISTINCT p_id FROM tree WHERE p_id IS NOT NULL)
AND p_id IS NOT NULL
ORDER BY id;