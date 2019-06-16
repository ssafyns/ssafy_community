const axios = require('axios');

export default {
  name: 'board',
  components: {},
  props: [],
  data () {
    return {

      title: "",
      freeboard: []

    }
  },
  computed: {
    filtered: function () {
      var ctitle = this.title.trim();

      return this.freeboard.filter(function (item, index) {
        if (item.freeboard_title.indexOf(ctitle) > -1) {
          return true;
        }
      });
    }

  },
  mounted () {
    this.getList();

  },
  created(){
    this.getList();
    console.log("하위^^")
  },
  watch : {
    '$route' : 'getList'
  },
  methods: {
    searchTarget: function (e) {
      this.title = e.target.value;
      console.log(this.title);
      console.log(e.target.value);

    },
    getList : function() {
      axios.get('http://172.30.1.56:8080/freeBoards').then(response => {


          this.freeboard = response.data;
          console.log(this.freeboard);

      })
    },

    //번호찾기
    detailBoard : function(boardNo) {
      console.log(boardNo);
      axios.get('http://172.30.1.56:8080/freeBoard'+'/'+boardNo).then(response => {
        if(response.data == true) {
          this.$store.state.freeboard = response.data;
          console.log(this.$store.freeboard);
        }
      }).then(this.$router.replace({
        name : 'board_detail'
      }))



    }

  }
}
