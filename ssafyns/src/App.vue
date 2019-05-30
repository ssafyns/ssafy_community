<script>
  import Navigator from '@/components/navigator/index.vue'

  export default {
    name: "navigator",
    components : {
      Navigator
    }
  }
</script>

<template>
  <div id="app">
      <template>
        <Navigator></Navigator>
      </template>
    <div id="nav">
      <!--<router-link to="/about">About</router-link> |
      <router-link to="/login">Login</router-link> |
      <router-link to="/signup">Signup</router-link>-->
    </div>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;

}
</style>




