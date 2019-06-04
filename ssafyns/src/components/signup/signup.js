const axios = require('axios');

export default {
  name: 'signup',
  components: {},
  props: [],
  data () {
    return {
      userName : '', // 유저 이름
      userId : '', // 유저 아이디(이메일)
      userPw : '', // 유저 패스워드
      userCpw : '', // 패스워드 확인
    }
  },
  computed: {

  },
  mounted () {

  },
  methods: {
    goSignup() { // 클릭 시 회원가입
      if(this.userPw !== this.userCpw) {
        alert('비밀번호를 확인해주세요');
      }else if(this.userPw === this.userCpw){
        axios.post('http://70.12.247.42:8080/user', {
          user_id : this.userId,
          user_pw : this.userPw,
          user_name : this.userName,
          user_nickname : '해위',
          user_phone: '010',
          user_email: 'dml',
          user_gender: 'm',
          user_edu_city: '서울',
          user_th : 1,
          user_rank : '1th',
          user_point : 10000,
          user_photo: 'aaa',
          user_isleave : 1
        })
            .then(response => {
              console.log(response.data);
              if(response.data) {
                alert('회원가입 성공');
                this.goLogin();
              }
            })
            .catch(error => {
              alert(error);
            });
      }

    },
    goLogin() { // 회원가입 성공 시 로그인 페이지로 이동
      this.$router.push({
        name: 'login'
      });
    }
  }
}
