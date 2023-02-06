    //--상품클릭후 상세페이지 start--
    $('div.productlist').on('click', 'div.product', (e)=>{

        //parents: 현재객체입장에서 부모나 조상객체를 찾는 메서드
        //parent: 바로 위 부모
        //클릭한 상품번호를 얻어오는 작업
        let prodNo = $(e.target).parents('div.product').find('div.prodNo').html()
        location.href='./productinfo.html?prodNo=' + prodNo
    })



    $('div.member>div.field>span.placehold-text').on('click', 'input.button', (e)=>{

        //parents: 현재객체입장에서 부모나 조상객체를 찾는 메서드
        //parent: 바로 위 부모
        //클릭한 상품번호를 얻어오는 작업
        let prodNo = $(e.target).parents('div.product').find('div.prodNo').html()
        location.href='./productinfo.html?prodNo=' + prodNo
    })


    //--상품클릭후 상세페이지 end--