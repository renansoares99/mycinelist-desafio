<template>
  <div>
    <b-navbar toggleable type="dark" variant="dark">
      <b-navbar-toggle target="navbar-toggle-collapse">
        <template #default="{ expanded }">
          <b-icon v-if="expanded" icon="chevron-bar-up"></b-icon>
          <b-icon v-else icon="chevron-bar-down"></b-icon>
        </template>
      </b-navbar-toggle>

      <b-navbar-brand href="#">NavBar</b-navbar-brand>

      <b-collapse id="navbar-toggle-collapse" is-nav>
        <router-link to="/"> Home </router-link>
        <router-link to="/about"> About </router-link>
        <b-navbar-nav class="ml-auto">
          <p class="text-white"> TEST </p>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <router-view />
  </div>
</template>

<style>
</style>
