export default {
  name: 'navigator',
  components: {},
  props: [],
  data () {
    return {

    }
  },
  computed: {

  },

  methods: {
    signOut() {
      console.log('로그라웃');
      this.$store.state.userInfo = undefined;
      this.$router.push({
        name: 'login'
      });
    },
    pu() {
      this.$router.push({
        name: 'login'
      })
    }
  },

}

