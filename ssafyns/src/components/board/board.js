const axios = require('axios');

export default {
  name: 'board',
  components: {},
  props: [],
  data () {
    return {

      title: "",
      freeboard: [
        {
          "freeboard_no":1,
          "user_uid":"chlgn66",
          "freeboard_title" : "싸피홧팅",
          "freeboard_hits" : 50,
          "freeboard_date" : "5/30"
        }
      ]

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

  },
  created(){
    this.getList()
    console.log("하위^^")
  },
  methods: {
    searchTarget: function (e) {
      this.title = e.target.value;
      console.log(this.title);
      console.log(e.target.value);

    },
    getList : function() {
      axios.get('http://192.168.11.26:8080/login').then(response => {
        console.log(response.data);
        if(response.data===true){
          this.freeboard = response.data;
        }
      })
    },
    registerBoard : function() {

    },
    detailBoard : function() {

    }

  }
}
