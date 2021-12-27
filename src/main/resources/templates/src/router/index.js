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
    path: '/home/filme',
    name: 'HomeF',
    component: () => import('@/views/HomeF.vue')
  },
  {
    path: '/home/serie',
    name: 'HomeS',
    component: () => import('@/views/HomeS.vue')
  },
  {
    path: '/cadastro/filme',
    name: 'CadastrarFilme',
    component: () => import('@/views/CadastrarFilme.vue')
  },
  {
    path: '/cadastro/serie',
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
