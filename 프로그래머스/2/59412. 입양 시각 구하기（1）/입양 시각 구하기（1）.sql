SELECT TO_NUMBER(HOUR) AS HOUR, COUNT(HOUR) AS COUNT
FROM (
        SELECT TO_CHAR(DATETIME,'HH24') AS HOUR
        FROM ANIMAL_OUTS
     )
GROUP BY HOUR 
HAVING HOUR BETWEEN 9 AND 19
ORDER BY HOUR;