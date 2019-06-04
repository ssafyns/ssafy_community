<template>
  <div class="about">



    <div class="input-group mb-3" style="width: 70%; margin: 0 auto">
      <div class="input-group-prepend">

        <select name="key" class="form-control">
          <option value="name">제목+내용</option>
          <option value="maker">제목</option>
          <option value="material">내용</option>
        </select>
      </div>
      <input type="text" class="form-control" aria-label="Text input with dropdown button" v-model="title">
      <button id="searchBtn"  class="btn btn-primary" :value="title" @click="searchTarget" >검색</button>
    </div>

    <table class="table" style="width: 70%; margin : 0 auto">
      <thead class="table-primary">
      <tr>
        <th scope="col">번호</th>
        <th scope="col">글쓴이</th>
        <th scope="col">조회수</th>
        <th scope="col" style="width: 400px">제목</th>
        <th scope="col">날짜</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="c in filtered"> <!--filtered 뭐징-->
        <th scope="row">{{c.no}}</th>
        <td>{{c.id}}</td>
        <td>{{c.count}}</td>
        <a href="#"><td>{{c.content}}</td></a>
        <td>{{c.day}}</td>
      </tr>

      </tbody>
    </table>
  </div>
</template>

<script>
  export default {
    data: ()=> ({
      title: "",
      contents: [{
        no: 1,
        id: "chlgn66",
        count: 500,
        content: "솔직히 잡페어 개노잼",
        day: "05/29"
      },
        {
          no: 2,
          id: "smjdent",
          count: 250,
          content: "싸피홧팅",
          day: "05/29"
        }
      ]
    }),
    computed: {
      filtered: function () {
        var ctitle = this.title.trim();

        return this.contents.filter(function (item, index) {
          if (item.content.indexOf(ctitle) > -1) {
            return true;
          }
        });
      }
    },
    methods: {
      searchTarget: function (e) {
        this.title = e.target.value;
        console.log(this.title);
        console.log(e.target.value);

      }
    }

  };
</script>
