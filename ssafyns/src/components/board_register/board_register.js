export default {
  name: 'board-register',
  components: {},
  props: [],
  data () {
    return {
      freeboard_title : '',
      freeboard_content : ''
    }
  },
  computed: {

  },
  mounted () {

  },
  methods: {
    //게시판 글 등록하는 함수!!!!
    registerClick : function() {
      console.log(this.freeboard_title);
      console.log(this.freeboard_content);
    }

  }
}
