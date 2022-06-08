
CREATE TABLE amigo_board (
 board_idx VARCHAR2(10) PRIMARY KEY,
 board_title VARCHAR2(100) NOT NULL,
 board_contents VARCHAR2(3000),
 read_count Number(10) default 0,
 notice_flag VARChAR2(2),
 insert_user VARCHAR2(50),
 insert_time VARCHAR2(20),
 insert_ip VARCHAR2(20)
);
commit;

--drop Table amigo_board;
SELECT * FROM amigo_board;


SELECT *
        FROM (
                 SELECT ROWNUM
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
          AND a.board_title like 'test'
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
        
        
        INSERT INTO "HR"."AMIGO_BOARD"
            (BOARD_IDX
            , BOARD_TITLE
            , BOARD_CONTENTS
            , READ_COUNT
            , NOTICE_FLAG
            , INSERT_USER
            , INSERT_TIME
            , INSERT_IP) 
            VALUES ('1'
                , 'test'
                , 'test2'
                , '2'
                , 'N'
                , 'admin
                ', '(null)'
                , '127.0.0.1'
                )