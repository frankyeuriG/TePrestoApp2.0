package edu.ucne.tepresto.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.tepresto.data.local.TePrestoDb
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesDatabase(@ApplicationContext context: Context): TePrestoDb {
        return Room.databaseBuilder(
            context,
            TePrestoDb::class.java,
            "TePresto.db"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesOcupacionDao(db: TePrestoDb) = db.ocupacionDao

    @Singleton
    @Provides
    fun providesPersonaDao(db: TePrestoDb) = db.personaDao
}