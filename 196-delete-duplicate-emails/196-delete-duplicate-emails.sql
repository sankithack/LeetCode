# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
Delete p1 from Person p1,
    Person p2
Where
    p1.Email = p2.Email And p1.Id> p2.Id;
