import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('@/views/Home.vue')
  },
  {
    path: '/home-f',
    name: 'HomeF',
    component: () => import('@/views/HomeF.vue')
  },
  {
    path: '/home-s',
    name: 'HomeS',
    component: () => import('@/views/HomeS.vue')
  },
  {
    path: '/cadastro-f',
    name: 'CadastrarFilme',
    component: () => import('@/views/CadastrarFilme.vue')
  },
  {
    path: '/cadastro-s',
    name: 'CadastrarSerie',
    component: () => import('@/views/CadastrarSerie.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
