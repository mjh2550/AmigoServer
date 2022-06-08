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
//            var d = JSON.parse(data)
            //$("#resultDiv").replaceWith(fragment);
            //왜 undefined??????????
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

                    /*
                <tr th:each="VO : ${boardList}">
                    <td th:text="${VO.idx}"></td>
                    <td th:text="${VO.title}"></td>
                    <td th:text="${VO.insertUser}"></td>
                    <td th:text="${VO.readCount}"></td>
                    <td th:text="${VO.insertDate}"></td>
                    <td th:text="${VO.noticeFlag}"></td>
                </tr>
                     */

                    let idx = resultList[i].boardIdx;
                    let title = resultList[i].boardTitle;
                    let insertUser = resultList[i].insertUser;
                    let readCount = resultList[i].readCount;
                    let insertTime = resultList[i].insertTime;
                    let noticeFlag = resultList[i].noticeFlag;


                    html+="<tr>"
                        + "<td>" + idx        + "</td>"
                        + "<td>" + title      + "</td>"
                        + "<td>" + insertUser + "</td>"
                        + "<td>" + readCount  + "</td>"
                        + "<td>" + insertTime  + "</td>"
                        + "<td>" + noticeFlag + "</td>"

                        + "</tr>";

                }

            }

            $("#resultList").html(html);

        });


}