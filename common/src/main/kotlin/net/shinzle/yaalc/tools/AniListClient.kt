package net.shinzle.yaalc.tools

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Mutation
import com.apollographql.apollo3.api.Query
import com.apollographql.apollo3.api.Subscription

object AniListClient{
    private val client = ApolloClient.Builder()
        .serverUrl("https://graphql.anilist.co")
        .build()

    fun <T: Query.Data> queryAny(query: Query<T>) = client.query(query)
    fun <T: Mutation.Data> mutateAny(query: Mutation<T>) = client.mutation(query)
    fun <T: Subscription.Data> subscribeAny(query: Subscription<T>) = client.subscription(query)
}
