const axios = require('axios');


export default {
  name: 'login',
  components: {},
  props: [],
  data () {
    return {
      userId : '',
      userPw : '',

    }
  },
  computed: {

  },
  mounted () {

  },
  methods: {
    goLogin() {
      console.log('goLogin');
      axios.get('http://3.19.69.215:8080/ssafyns/login'+'/'+this.userId + '/'+this.userPw)
          .then(response => {
            console.log(typeof response.data);
            if(response.data)  {
              alert('로그인 성공');
              // 로그인 성공하면 store에 userId 저장.
              console.log('ttt : ', this.$store.state.userId);
              this.$store.state.userId = this.userId;
              this.getUser();
              this.goHome();
            }else if(response.data === false) {
              alert('아이디와 비밀번호를 확인하세요');
            }
          })
    },
    getUser() {
      console.log('getUser');
      axios.get('http://3.19.69.215:8080/ssafyns/user/' + this.userId + ".")
          .then(response => {
            this.$store.state.userInfo = response.data;
            console.log(this.$store.getters.getUser);
          })
    },
    goHome() {
      this.$router.push({
        name: 'about'
      })
    }

  },
  created() {
    console.log('login created');
  },
}
