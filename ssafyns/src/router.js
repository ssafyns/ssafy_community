import Vue from 'vue'
import Router from 'vue-router'



Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/login',
      name: 'login',
      component : () => import('./views/Login.vue')
    },
    {
      path: '/signup',
      name: 'signup',
      component : () => import('./views/Signup.vue')
    },
    {
      path: '/board',
      name : 'board',
      component : () => import('./views/Board.vue')
    },
    {
      path:'/board_detail',
      name : 'board_detail',
      component : () => import('./views/Board_detail.vue')
    },
    {
      path:'/board_register',
      name : 'board_register',
      component : () => import('./views/Board_register.vue')
    }
  ]
});
