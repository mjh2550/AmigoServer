/*
 * 2022-06-13
 * 게시판(amigo_board) 생성
 * 문호환
 */
CREATE TABLE amigo_board (
                             board_idx INT(100) AUTO_INCREMENT PRIMARY KEY,
                             board_title VARCHAR(100) NOT NULL,
                             board_contents VARCHAR(3000),
                             read_count INT(10) default 0,
                             notice_flag VARCHAR(2),
                             insert_user VARCHAR(50),
                             insert_time VARCHAR(20),
                             insert_ip VARCHAR(20)
);

/*
 * 2022-06-13
 * 게시판(amigo_board) select
 * 문호환
 */
SELECT * FROM amigo_board;

SELECT *
FROM (
         SELECT row_number() over(order by board_idx asc) ROWNUM
              , board_idx
              , board_title
              , read_count
              , notice_flag
              , insert_user
              , insert_time
              , insert_ip
         FROM amigo_board
     ) a
WHERE 1=1
  AND ROWNUM between 1 AND  2
--   AND a.board_title like 'test'
order by a.board_idx asc;

SELECT board_idx
     , board_title
     , read_count
     , notice_flag
     , insert_user
     , insert_time
     , insert_ip
FROM amigo_board
where 1=1;

/*
 * 2022-06-13
 * 게시판(amigo_board) insert
 * 문호환
 */
INSERT INTO AMIGO_BOARD
(BOARD_IDX, BOARD_TITLE, BOARD_CONTENTS, READ_COUNT, NOTICE_FLAG, INSERT_USER, INSERT_TIME, INSERT_IP)
VALUES
    ( null, 'test', 'test3', 0 , 'N', 'jhmoon', '20220613', '127.0.0.1');

/*
 * 2022-06-13
 * 게시판(amigo_board) delete
 * 문호환
 */
DELETE FROM AMIGO_BOARD;