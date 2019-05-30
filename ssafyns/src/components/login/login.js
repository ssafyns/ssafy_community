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
      axios.post('', {
        params : {
          id : this.userId,
          pw : this.userPw
        }
      })
          .then(response => {
              if(response.data === true)  {
                // action
              }
          })
    },

  }
}
