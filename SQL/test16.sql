SELECT A.BOOK_ID, B.AUTHOR_NAME, SUBSTR(A.PUBLISHED_DATE,1,10) AS PUBLISHED_DATE
FROM BOOK AS A, AUTHOR AS B
WHERE A.AUTHOR_ID = B.AUTHOR_ID
AND A.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE ASC
