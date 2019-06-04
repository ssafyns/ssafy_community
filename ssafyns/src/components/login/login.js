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
      axios.get('http://70.12.247.42:8080/login'+'/'+this.userId + '/'+this.userPw)
          .then(response => {
            console.log(typeof response.data);
            if(response.data)  {
              alert('로그인 성공');
              // 로그인 성공하면 store에 userId 저장.
              this.$store.state.userId = this.userId;
              this.$store.state.test = this.userId;
              console.log(this.$store.state.userId);
              this.goHome();
            }
          })
    },
    goHome() {
      this.$router.push({
        name: 'about'
      })
    }

  }
}
