function goList(pageNum) {

    let param = {
        "PAGE_NUM": pageNum ,
        "SEARCH_WORD" : $("#searchWord").val()
    }

    $.ajax({
        url: "/goList.do" ,
        data: param ,
        type : "post",
        datatype:"json"
        ,})
        .done(function (data) {
            // alert("당근빳다죠 시파"+ data.list);
            console.log(data.list);
            let resultList = data.list;
            let html="";
            //html 요소 추가
            //ajax 함수 호출로는 반복문 못씀
            //   console.log(resultList[0].idx);
            if(resultList==null || resultList.length==0){
                html="<tr>" +
                    "<td colspan='6'>" + "조회한 데이터가 없습니다." + "</td>"
                    + "</tr>";

            }else{
                for(let i=0;i<resultList.length;i++){

                    let idx = resultList[i].board_idx;
                    let title = resultList[i].board_title;
                    let insertUser = resultList[i].insert_user;
                    let readCount = resultList[i].read_count;
                    let insertTime = resultList[i].insert_time;
                    let noticeFlag = resultList[i].notice_flag;

                    html+="<tr>"
                        + "<td>" + idx        + "</td>"
                        + "<td>" + title      + "</td>"
                        + "<td>" + insertUser + "</td>"
                        + "<td>" + readCount  + "</td>"
                        + "<td>" + insertTime + "</td>"
                        + "<td>" + noticeFlag + "</td>"
                        + "</tr>";

                }

            }

            $("#resultList").html(html);

        });


}