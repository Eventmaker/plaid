/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.core.dagger.dribbble

import dagger.Module
import dagger.Provides
import io.plaidapp.core.dribbble.data.search.DribbbleSearchService
import retrofit2.Retrofit

@Module(includes = [DribbbleRetrofitModule::class])
class DribbbleDataModule {

    @Provides fun provideDribbbleSearchService(retrofit: Retrofit): DribbbleSearchService =
        retrofit.create(DribbbleSearchService::class.java)
}
